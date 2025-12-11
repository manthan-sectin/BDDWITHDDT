echo "------------------------------------------------------"
echo "-------------Starting the initialization--------------"
echo "------------------------------------------------------"

echo "Checking if hub is ready...."
count=0
while [ "$(curl -s http://192.168.31.155:4444/status | jq -r .value.ready)" != "true"]
do
	count=$((count+1))
	echo "Attempt: ${count}"
	if ["$count" -ge 60]
	then
		echo "***** Infrastructure is not up within 60 SECONDS *****"
		exit 1
	fi
		sleep 1
	done
	
	echo "Selenium Grid is up and running. Running the test...."

	mvn -f /home/seleniumbddtestframework/pom.xml test -DcliBrowser=${browser}		