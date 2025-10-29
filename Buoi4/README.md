Dưới đây là phần tổng hợp chi tiết về **tối ưu truy vấn**, **sử dụng index**, và **các khái niệm trong Transaction** như **ACID**, **dirty read**, **dirty write** — rất quan trọng khi học hoặc làm việc với cơ sở dữ liệu (Database Management Systems).

---

##  1. Tối ưu truy vấn (Query Optimization)

**Mục tiêu:**
Giúp truy vấn SQL chạy nhanh hơn, giảm tải cho CPU, bộ nhớ và đĩa của hệ thống cơ sở dữ liệu.

**Một số kỹ thuật tối ưu phổ biến:**

* **Chỉ lấy dữ liệu cần thiết:**

  * Dùng `SELECT` cụ thể thay vì `SELECT *`.
  * Ví dụ:

    ```sql
    SELECT name, age FROM users WHERE id = 1;
    ```
* **Giảm số lượng truy vấn:**

  * Gộp các truy vấn nhỏ bằng `JOIN` hoặc `IN`.
  * Hạn chế dùng truy vấn con (subquery) nếu không cần thiết.
* **Sử dụng `EXPLAIN` hoặc `EXPLAIN ANALYZE`:**

  * Giúp kiểm tra kế hoạch thực thi truy vấn (query execution plan).
  * Từ đó biết được có dùng index hay không, phần nào tốn tài nguyên.
* **Tránh tính toán trên cột trong mệnh đề WHERE:**

  * Ví dụ:

    ```sql
    -- KHÔNG TỐI ƯU
    WHERE YEAR(created_at) = 2024
    -- TỐI ƯU
    WHERE created_at BETWEEN '2024-01-01' AND '2024-12-31'
    ```

---

##  2. Sử dụng Index (Chỉ mục)

**Khái niệm:**
Index là một cấu trúc dữ liệu (thường là **B-tree**) giúp tăng tốc độ truy vấn bằng cách cho phép tìm kiếm dữ liệu nhanh hơn mà không cần quét toàn bộ bảng.

**Ví dụ:**

```sql
CREATE INDEX idx_users_email ON users(email);
```

**Khi nào nên dùng index:**

* Cột thường dùng trong `WHERE`, `JOIN`, `ORDER BY`, hoặc `GROUP BY`.
* Cột có **tính phân biệt cao (high cardinality)** — ví dụ: email, id.

**Khi không nên dùng index:**

* Bảng nhỏ (vì overhead tạo index lớn hơn lợi ích).
* Cột có ít giá trị khác nhau (ví dụ: `gender`, `status`).

**Lưu ý:**

* Cập nhật hoặc chèn dữ liệu (`INSERT`, `UPDATE`, `DELETE`) sẽ **chậm hơn** khi có nhiều index.
* Cần **cân bằng** giữa tốc độ đọc và tốc độ ghi.

---

##  3. Transaction (Giao dịch)

**Khái niệm:**
Transaction là **một nhóm thao tác SQL** được thực hiện như một đơn vị logic duy nhất — hoặc **thành công toàn bộ**, hoặc **thất bại toàn bộ**.

**Ví dụ:**

```sql
BEGIN TRANSACTION;
UPDATE accounts SET balance = balance - 100 WHERE id = 1;
UPDATE accounts SET balaKOe = balance + 100 WHERE id = 2;
COMMIT; -- xác nhận
-- hoặc ROLLBACK; nếu có lỗi
```

---

##  4. ACID Properties

ACID là tập hợp các đặc tính giúp đảm bảo tính toàn vẹn dữ liệu trong giao dịch.

| Thuộc tính          | Ý nghĩa        | Mô tả                                                                        |
| ------------------- | -------------- | ---------------------------------------------------------------------------- |
| **A – Atomicity**   | Tính nguyên tử | Toàn bộ transaction phải thực hiện trọn vẹn hoặc không thực hiện gì cả.      |
| **C – Consistency** | Tính nhất quán | CSDL phải ở trạng thái hợp lệ trước và sau khi transaction.                  |
| **I – Isolation**   | Tính độc lập   | Các transaction song song không ảnh hưởng đến nhau.                          |
| **D – Durability**  | Tính bền vững  | Khi transaction đã `COMMIT`, dữ liệu sẽ tồn tại kể cả khi hệ thống bị sự cố. |

---

##  5. Dirty Read & Dirty Write

###  Dirty Read

* Xảy ra khi **một transaction đọc dữ liệu chưa được commit** từ một transaction khác.
* Nếu transaction kia `ROLLBACK`, dữ liệu đọc được là **sai (dirty)**.
* Ví dụ:

  * Transaction A cập nhật số dư thành 5000 nhưng chưa `COMMIT`.
  * Transaction B đọc thấy 5000 → sai, vì có thể bị rollback.

###  Dirty Write

* Xảy ra khi **một transaction ghi đè dữ liệu mà transaction khác đang sửa nhưng chưa commit**.
* Gây **mất tính toàn vẹn dữ liệu**.
* Thường bị ngăn chặn bằng **các mức cô lập cao hơn** (isolation levels).

---

##  6. Isolation Levels (Mức cô lập trong Transaction)

| Mức cô lập       | Cho phép Dirty Read | Cho phép Non-repeatable Read | Cho phép Phantom Read |
| ---------------- | ------------------- | ---------------------------- | --------------------- |
| READ UNCOMMITTED | ✅                   | ✅                            | ✅                     |
| READ COMMITTED   | ❌                   | ✅                            | ✅                     |
| REPEATABLE READ  | ❌                   | ❌                            | ✅                     |
| SERIALIZABLE     | ❌                   | ❌                            | ❌                     |

---

Nếu bạn muốn, mình có thể vẽ **sơ đồ minh họa** về cách các transaction tương tác (ví dụ dirty read, dirty write, lock...) để bạn dễ hình dung hơn — bạn có muốn mình tạo hình minh họa không?
