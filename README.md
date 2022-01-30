# Find My Exam Schedule

### Creators:
[Abdullatif Hassan](https://github.com/Abdul099) and [Beyza Yıldırım](https://github.com/beyza-yildirim)

### Description:
This Java application allows students to find details about their final exams from the final schedule pdf file that is released before exam season. The user inputs the courses of interest via a GUI and receives back the information regarding the exams of those courses (date, time, location etc.). 
## Packages required: 
**Python:** tabula-py, requests, camelot, pandas

**Java:** Swing, AWT

Download the required python packages by:

```pip -r requirements.txt```

## Instructions:
1) Obtaining a CSV file from online PDF:

```cd src```

```python importing.py <url of the pdf file available online>```

2) Utilizing the schedule application:
Make sure the CSV file is present in src folder, then run main.java.

```javac main.java```

A GUI will appear, allowing the user to input their courses. 

User inputs list of their courses for the semester: 

![image](https://challengepost-s3-challengepost.netdna-ssl.com/photos/production/software_photos/001/376/531/datas/original.PNG)

Application outputs the exam information:

![image](https://challengepost-s3-challengepost.netdna-ssl.com/photos/production/software_photos/001/376/532/datas/original.PNG)

