#Steps to uploading greensheets to OU Campus and using the "Create Table" project to create an HTML table

1. Download all pdfs and put in a single directory
2. Visually inspect all filenames to make sure they are following the correct naming convention. If not, fix them before continuing to the next step
3. Open a terminal window and navigate to the directory with the greensheets
4. Use command “ls –1 > FileNames.txt” to create a file with all the file names listed
5. Use command “ls -1 | sed -e 's/\..*$//' > Renamed.txt” to create a file with all the file names listed without extensions
6. Login to OU Campus and upload all the inspected greensheets to the directory where you are saving greensheets (ask a senior webmaster if you are confused about this step)
7. Now publish all the files that you have just uploaded
8. Open the new "Renamed.txt" file in sublime text and use regular expressions to edit the file names to appear in the desired format for the webpage
9. Now open this project in Eclipse and update the three directories for the FileNames.txt, Renamed.txt, and TableOutput.txt (path to where you want to create this new file) files
10. Open the TableOutput.html file and check if the table behaves as expected (check the links to see that they are linked correctly)
11. Copy paste this html table at the bottom of the existing html table you would like to append to on OU Campus


This Java project was created using Eclipse and has not been exported to a stand alone application as of yet. As a future project, if time permits (should not take very long), future web designers can export this application as well as automate some of the tasks listed above that used the terminal using a shell script. There is also a lot of room for improvement in this project, so feel free to play around with it.