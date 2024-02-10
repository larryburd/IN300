# Create data frame with values provided
packets <-data.frame(SOURCE_IP = c("209.99.66.22", "209.99.66.100", "192.168.1.3"),
                     DEST_IP = c("192.168.0.12", "209.99.66.222", "192.168.0.44"),
                     PROTOCOL = c("UDP", "ICMPT", "TCP"),
                     INFO = c("LEN=1068", "Destination Unreachable", "Len=128"))

# Print the data frame
print("Data Frame")
print(packets)
cat("\n")

# Print out the source IP list
source_list <- packets[1]
print("Soure IP List")
print(source_list)
cat("\n")

# Create and print out a matrix from SOURCE_IP and DEST_IP
IP_Matrix <- packets[c("SOURCE_IP", "DEST_IP")]
print("IP Matrix")
print(IP_Matrix)
cat("\n")

# Filter and print UDP if it's in the PROTOCOL list
print("Display whether 'UDP' is in the list of protocols")
print(packets$PROTOCOL == "UDP")