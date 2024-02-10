#install.packages("ggplot2")
library(ggplot2)

data <- read.csv("C:\\Users\\laure\\OneDrive\\Documents\\Purdue\\IN300 - Programming for Data Analysis\\Unit 8\\Demographic_Statistics_By_Zip_Code.csv")

print(qplot(data$COUNT.FEMALE, data$COUNT.MALE, data=data, geom=c("point", "smooth")))