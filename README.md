<h2>Steps to uploading greensheets to OU Campus and using the "Create Table" project to create an HTML table</h2>

<ol>
	<li>Download all pdfs and put in a single directory</li>
	<li>Visually inspect all filenames to make sure they are following the correct naming convention. If not, fix them before continuing to the next step</li>
	<li>Open a terminal window and navigate to the directory with the greensheets</li>
	<li>Use command “ls –1 > FileNames.txt” to create a file with all the file names listed</li>
	<li>Use command “ls -1 | sed -e 's/\..*$//' > Renamed.txt” to create a file with all the file names listed without extensions</li>
	<li>Login to OU Campus and upload all the inspected greensheets to the directory where you are saving greensheets (ask a senior webmaster if you are confused about this step)</li>
	<li>Now publish all the files that you have just uploaded</li>
	<li>Open the new "Renamed.txt" file in sublime text and use regular expressions to edit the file names to appear in the desired format for the webpage</li>
	<li>Now open this project in Eclipse and update the three directories for the FileNames.txt, Renamed.txt, and TableOutput.txt (path to where you want to create this new file) files.</li>
	<li>Open the TableOutput.html file and check if the table behaves as expected (check the links to see that they are linked correctly)</li>
	<li>Copy paste this html table at the bottom of the existing html table you would like to append to on OU Campus</li>
<ol>

<p>
	This Java project was created using Eclipse and has not been exported to a stand alone application as of yet. As a future project, if time permits (should not take very long), future web designers can export this application as well as automate some of the tasks listed above that used the terminal using a shell script. There is also a lot of room for improvement in this project, so feel free to play around with it.
</p>