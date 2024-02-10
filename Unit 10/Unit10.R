# RUN THIS LINE IF sqldf NOT INSTALLED
# install.packages("sqldf")

library(sqldf)

# Set File Path
dataFile <- file.path("C:\\Users\\laure\\OneDrive\\Documents\\Purdue",
                      "\\IN300 - Programming for Data Analysis\\",
                      "Unit 10\\IN300_Dataset1.csv")

# Read file
data <- read.csv(dataFile)

# Print suspicious results (frequency > 100 )
print(sqldf("SELECT Source, Destination, Protocol, Length, Info, COUNT(*) as Freq
            FROM data
            WHERE Protocol Like ('%0%')
            GROUP BY Source, Destination, Protocol, Length, Info
            HAVING Freq > 100
            ORDER BY Freq DESC"))