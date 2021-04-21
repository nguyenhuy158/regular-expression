# Problem

> Hãy kiểm tra tên đăng nhập với yêu cầu:
> - Chữ đầu tiên không phải là số.
> - Chiều dài trong khoảng từ 4 -> 12 ký tự.
> - Chỉ chấp nhận các chữ số từ 0-9, chữ cái thường, chữ cái hoa và dấu gạch dưới (_).

### my Solution
-------------
- regex
```
\b[a-zA-z_]\w{3,11}\b
```
- in java
``` java
```