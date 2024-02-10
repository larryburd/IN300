import pandas as pd
import numpy as np
import matplotlib.pyplot as plt

# Set Column Names
colNames = ['ID', 'Traffic_Volumn_Count_Location_Address', 'Street',
            'Date_of_Count', 'Total_Passing_Vehicle_Volumn',
            'Vehicle_Volumn_by_Each_Direction_of_Traffic', 'Lattitude', 'Longitude', 'Location']

# Get data from data file
data = pd.read_csv("C:\\Users\\laure\\OneDrive\\Documents\\Purdue\\IN300 - Programming for Data Analysis\\Unit 8\\Average_Daily_Traffic_Counts.csv")

# Get the mean of the data
mean = data.mean(axis = 0)

# PLot the mean
mean.plot(kind='bar')

# Generate visual
plt.show()