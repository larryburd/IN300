library(mice)

# Set File Path
dataFile <- file.path("C:\\Users\\laure\\OneDrive\\Documents\\Purdue\\",
                      "IN300 - Programming for Data Analysis",
                     "\\Unit 6\\IN300_Dataset1.csv")

# Parse Data
data <- read.csv(dataFile, sep=',')

# Print output
#print(paste("Row: ", data[,1], " Source IP: ", data[,3], " Dest IP: ", data[,4]))

md.pattern(data)