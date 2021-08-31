# Problem

> Hãy kiểm tra tên đăng nhập với yêu cầu:
> - Chữ đầu tiên không phải là số.
> - Số buộc phải nằm ở cuối.
> - Cho phép chữ hoa chữ thường.
> - Khi chỉ có 2 từ buộc là chữ hết.

### my Solution
-------------
- regex
```
^[a-zA-Z]{2,}\d*$|^[a-zA-Z]\d\d+$
```
- in js
``` javascript
let userCheck = /^[a-zA-Z]{2,}\d*$|^[a-zA-Z]\d\d+$/;
```
