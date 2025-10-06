# Buổi 1:
- [Buổi 1:](#buổi-1)
  - [CSDL là gì:](#csdl-là-gì)
  - [Hệ quản trị CSDL là gì:](#hệ-quản-trị-csdl-là-gì)
    - [6 Chức năng của DBMS:](#6-chức-năng-của-dbms)
  - [Câu lệnh tạo database, table trong MS SQL Server](#câu-lệnh-tạo-database-table-trong-ms-sql-server)
  
## CSDL là gì:
- Cơ sở dữ liệu (database) là một tập hợp các dữ liệu rời rạc được tổ chức, lưu trữ và quản lý theo hệ thống để có thể dễ dàng truy xuất, chỉnh sửa và cập nhật. Chúng thường được sử dụng để lưu trữ thông tin trong các hệ thống phần mềm và ứng dụng, từ dữ liệu cá nhân cho đến thông tin doanh nghiệp quan trọng. Cơ sở dữ liệu giúp các tổ chức và cá nhân tổ chức dữ liệu một cách có cấu trúc, nhằm mục đích quản lý và xử lý dữ liệu hiệu quả hơn.

- VD: Trong cuộc sống bạn có thể thấy rất nhiều cơ sở dữ liệu đó, nếu bạn vào thư viện thì ở trên đó là một cơ sở dữ liệu, phân loại sách theo chủ đề: xã hội, tự nhiên, khoa học … đó cũng là một dạng cở sở dữ liệu đơn giản.

- **Mục đích ta sử dụng CSDL** là vì cho dễ quản lý và tìm kiếm, thống nhất việc lưu trữ thông tin. Có thể tìm kiếm một cách nhanh chóng khi cần thông tin nào đó và cũng có thể lôi các thông tin liên quan với thông tin đó ra luôn.

## Hệ quản trị CSDL là gì:
- Hệ quản trị cơ sở dữ liệu (Database Management System-DBMS) là một phần mềm được ứng dụng để quản lí và tổ chức các cơ sở dữ liệu. Nó cung cấp các công cụ và chức năng để lưu trữ , truy xuất, cập nhật và xử lí dữ liệu trong các cơ sở dữ liệu.
- DBMS cho phép người dùng tạo, thiết kế và quản lí cơ sở dữ liệu theo cách có tổ chức. Nó hỗ trợ ngôn ngữ truy vấn để truy xuất và thao tác dữ liệu . Đồng thời, DBMS cung cấp các cơ chế bảo mật và kiểm soát truy cập để đảm bảo an ninh và quyền riêng tư của data.
- Với DBMS, người dùng có khả năng quản lí hiệu quả cơ sở dữ liệu và tận dụng các tính năng tiện ích như sao lưu và phục hồi dữ liệu , tối ưu hóa hiệu suất truy vấn. Cũng như đảm bảo tính nhất quán của dữ liệu. Nó là công cụ không thể thiếu để xử lí dữ liệu một cách hiệu quả và đáng tin cậy trong môi trường  kinh doanh và các ứng dụng thông tin khác.
### 6 Chức năng của DBMS:

**Quản lí cấu trúc dữ liệu**

    DBMS cho phép  định nghĩa và quản lí cấu trúc của csdl, bao gồm các bảng, trường , quan hệ và ràng buộc. Đồng thời , đảm nhận vai trò trong việc duy trì dữ liệu cấu trúc trong hệ thống. Chức năng này giúp đảm bảo được tính nhất quán, độ bảo mật và hiệu quả của dữ liệu.

**Lưu trữ dữ liệu**

    Hệ quản trị csdl quản lí việc lưu trữ dữ liệu trên ổ cứng hoặc bộ nhớ. Đảm bảo tính toàn vẹn, chỉnh chu và an toàn của dữ liệu. Ngoài ra , còn quản lí các tệp dữ liệu và cung cấp giao diện cho người dùng. Để thực hiện các hoạt động cơ bản như: Thêm sửa đổi hay truy xuất dữ liệu từ máy.
    
**Truy xuất dữ liệu**

    Quản trị cơ sở dữ liệu cung cấp đầy đủ các công cụ và ngôn ngữ truy cập để xuất dữ liệu ra. Người dùng có thể sử dụng các câu lệnh truy vấn để tìm kiếm, lọc và truy xuất thông tin cần thiết. Đồng thời, nó cũng cung cấp các cơ chế tối ưu hóa truy vấn để đảm bảo được hiệu suất tốt nhất.

**Bảo mật và quản lý quyền truy cập**

    Hệ quản trị cơ sở dữ liệu có thể thiết lập các quyền truy cập và kiểm soát an ninh để bảo vệ dữ liệu khỏi truy cập trái phép hoặc thay đổi không đúng. DBMS cung cấp cơ chế bảo mật đáng tin cậy để đảm bảo được sự an toàn tuyệt đối cho dữ liệu. Mặt khác, cũng có cơ chế mã hóa dữ liệu, kết hợp với các phương pháp khác để dữ liệu không bị “leak” ra bên ngoài.

**Xử lý giao transaction**

    DBMS hỗ trợ xử lý giao dịch (transaction) để đảm bảo tính nhất quán và độ tin cậy của cơ sở dữ liệu khi có nhiều người dùng cùng truy cập và thay đổi dữ liệu. DBMS sử dụng các cơ chế như ghi log và checkpoint để đảm bảo được tính toàn vẹn và độ tin cậy cao. Khả năng phục hồi nhanh chóng trong quá trình xử lý các giao dịch.

**Sao lưu và phục hồi dữ liệu**

    Hệ quản trị cơ sở dữ liệu cung cấp chức năng sao lưu và phục hồi dữ liệu để đảm bảo dữ liệu được bảo vệ và khôi phục sau khi xảy ra lỗi hoặc sự cố. Chức năng sao lưu cho phép tạo các bản sao dữ liệu và lưu trữ nó ở vị trí an toàn nhất. Quá trình sao lưu cần được diễn ra định kỳ để dữ liệu có thể khôi phục khi cần thiết.

## Câu lệnh tạo database, table trong MS SQL Server

```database
-- Tạo database 
create database SQLDBQuery

Câu lệnh tạo database
