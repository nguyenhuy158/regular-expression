# Problem

> Hãy viết chuỗi Regex kiểm tra định dạng của thẻ cào điện thoại với cấu trúc như sau: xxxx-xxxx-xxxx-xxxx, trong đó x là các số từ [0-9]

### my Solution
-------------
- regex
```
\b\d{4}-\d{4}-\d{4}-\d{4}\b
```
- in java
``` java
\\b\\d{4}-\\d{4}-\\d{4}-\\d{4}\\b
```