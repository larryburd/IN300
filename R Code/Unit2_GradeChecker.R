#########################
#     Grade Checker     #
#########################
# Author:   Laurence Burden
# Date:     3 May 2021

gradePercent <- as.integer(readline("Enter grade percent from 0 - 100: "))

# Set relevant grade letter
if (gradePercent <= 100 && gradePercent >= 90) {
  letterGrade <- "A";
} else if(gradePercent <= 89 && gradePercent >= 80) {
  letterGrade <- "B";
} else if(gradePercent <= 79 && gradePercent >= 70) {
  letterGrade <- "C";
} else if(gradePercent <= 69 && gradePercent >= 60) {
  letterGrade <- "D";
} else if(gradePercent <= 59 && gradePercent >=0) {
  letterGrade <- "F";
} else {
  letterGrade = "INVALID GRADE";
}

# Print letter grade to user
print(paste("Your grade is", letterGrade))