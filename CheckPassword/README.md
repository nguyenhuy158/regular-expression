# Problem

> Hãy kiểm tra mật khẩu với yêu cầu:
> - Mật khẩu ít nhất 8 ký tự.
> - Phải có chữ hoa, chữ thường, số và 1 ký tự đặc biệt.

### my Solution
----
- regex
```
\b[a-zA-z_]\w{3,11}\b
```
- in java
``` java
\\b[a-zA-z_]\\w{3,11}\\b
```
other
-------
is have less one special character
```
^(?=.*?[@$!%*?&]).{8,}$
```