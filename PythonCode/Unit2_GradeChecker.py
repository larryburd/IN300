#########################
#     Grade Checker     #
#########################
# Author:   Laurence Burden
# Date:     30 April 2021

# Retrieve grade from user and initialize letter grade var
gradePercent = int(input("Enter the grade percentage: "))
letterGrade = ""

# Set relevant letter grade
if 100 >= gradePercent >= 90:
    letterGrade = "A"
elif 89 >= gradePercent >= 80:
    letterGrade = "B"
elif 79 >= gradePercent >= 70:
    letterGrade = "C"
elif 69 >= gradePercent >= 60:
    letterGrade = "D"
elif 59 >= gradePercent >= 0:
    letterGrade = "F"
else:
    letterGrade = "INVALID GRADE"

# Print to user
print("You received an " + letterGrade)