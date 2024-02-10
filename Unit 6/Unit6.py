######################
#     CSV Reader     #
######################
# Author:   Laurence Burden
# Date:     1 June 2021

import pandas as pd

# Set File Path
dataFile = "C:\\Users\\laure\\OneDrive\\Documents\\Purdue" \
            "\\IN300 - Programming for Data Analysis\\Unit " \
           "6\\IN300_Dataset1.csv"

# Read file into pandas data frame
data = pd.read_csv(dataFile, sep=',')

# Create output for user
dataOutput = data[['No.', 'Source', 'Destination']]
print(dataOutput)
