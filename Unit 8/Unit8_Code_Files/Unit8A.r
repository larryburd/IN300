#install.packages("corrgram")
library(corrgram)

traffic <- read.csv("C:\\Users\\laure\\OneDrive\\Documents\\Purdue\\IN300 - Programming for Data Analysis\\Unit 8\\Average_Daily_Traffic_Counts.csv")

print(corrgram(traffic, lower.panel=panel.conf, upper.panel=panel.pts))
