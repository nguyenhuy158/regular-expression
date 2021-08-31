# Problem

> Hãy kiểm tra tên đăng nhập với yêu cầu:
> - Chữ đầu tiên không phải là số.
> - ·ó t·ể ·ết t·úcă·ằng ·ô
> -···ợc p·ép ·à c·ữ v·ết hoa ·à v·ết t·ường.
> - khi c·ỉ ·ó 2 ·ừ t·ì ô·ộc ·à 2 c·ữ ·ái.

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