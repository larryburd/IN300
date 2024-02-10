import numpy as np
from scipy import stats

data = np.loadtxt("C:\\Users\\laure\\OneDrive\\Documents\\Purdue\\IN300 - Programming for Data Analysis\\Unit 7\\IN300_Dataset2.txt")

# Print the mean
print("The mean is: ", np.mean(data))

# Print the median
print("The median is: ", np.median(data))

# Get the mode
md = int(stats.mode(data)[0])

# Print the mode
print("The mode is: ", md)

# Print the standard deviation
print("The standard deviation is: ", np.std(data))
