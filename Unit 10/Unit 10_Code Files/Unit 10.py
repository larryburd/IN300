import pandas as pd


# Returns true if string starts with a number
def starts_with_number(input_string):
    return input_string[0].isdigit()


# Print results with headers
def print_results(headers, packets):
    print(*headers, sep="    ")
    for packet in packets:
        print(*packet, sep="  ")


# Set File Path
dataFile = "C:\\Users\\laure\\OneDrive\\Documents\\Purdue" \
            "\\IN300 - Programming for Data Analysis\\Unit 10" \
           "\\IN300_Dataset1.csv"
maliciousPackets = []  # result set
dataHeaders = ["Source", "Destination", "Protocol", "Length", "Info"]

data = pd.read_csv(dataFile, sep=",", decimal=".", header=0)

# Group the packets by frequency
groupedPackets = data.groupby(dataHeaders).size().index.tolist()

# Get the actual number of frequencies of each packet type
groupedPacketsFreq = data.groupby(dataHeaders).size().tolist()

# Loop through each packet group frequency
for i in range(len(groupedPacketsFreq)):
    # Check if frequency of packet type is > 100
    if groupedPacketsFreq[i] > 100:
        # Get the actual packet protocol and check if malicious
        # Only protocols that start with a numeric character are considered malicious
        if starts_with_number(groupedPackets[i][2]):
            # convert the supplied tuple to a list
            maliciousPacket = list(groupedPackets[i])
            # Add the frequency to the packet info
            maliciousPacket.append(groupedPacketsFreq[i])
            maliciousPackets.append(maliciousPacket)

# Add frequency to list of headers
dataHeaders.append("Freq")
# Print results to user
print_results(dataHeaders, maliciousPackets)
