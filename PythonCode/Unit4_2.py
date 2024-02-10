########################################
#     Dictionary Creation and User     #
########################################
# Author:   Laurence Burden
# Date:     15 May 2021

# Create packet dictionary
packet = {
    "SOURCE_IP": "209.99.66.22",
    "DEST_IP": "192.168.0.12",
    "PROTOCOL": "UDP",
    "INFO": "LEN=1068"
}

# Loop through and print each key value pair
for elem in packet:
    print("Key: " + elem + " equals value: " + packet.get(elem))
