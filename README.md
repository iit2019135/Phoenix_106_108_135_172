# Phoenix_106_108_135_172
Sofware Engineering Group Project

**INDIAN INSTITUTE OF INFORMATION TECHNOLOGY ALLAHABAD , INDIA**
PROJECT : AUTOMATIC HVAC MONITORING SYSTEM 
SOFTWARE DESIGN SPECIFICATION

**Submitted to :**
Department of Information Technology

**Group Members 

IIT2019108 - Madasi Harsha Vardhan
IIT2019106 - Ramavath Jayaram Naik
IIT2019135 - Kathuri Abhinav
IIT2019172 -N V Vasanth Reddy

Instructors: Amit Kumar and Ashutosh Kumar 
Course: Software Engineering (SWE) 
Date: 16th Feb 2021


**1. INTRODUCTION :-

Based on the environment inside the building the system should be able to automatically adjust the temperature with the help of ACs, fans, heaters, etc., create the ventilation for the air to refresh it after regular intervals of time to maintain the air quality. The input sensor data involves the temperature, humidity and air quality. The air quality can be measured in terms of Air Quality Index (AQI) values ranging from 0 to 500 degrees based on the presence of pollutants, refer below figure for standard benchmarks. On the basis of the sensed data we can adjust the temperature and ventilation accordingly, which also lead to efficient management of energy

**PURPOSE :-**
To efficiently maintain the temperature and humidity of the CC3 building.

**SCOPE :-**

**1.2.1. INSCOPE :-**
Maintain fan, AC, Window, Heater, etc… accordingly with outside temperature and humidity. 

**1.2.2. OUTSCOPE :-**
There is no automation in the CC3 building of the IIIT Allahabad campus with all its devices.
There is no emergency automation for CC3 building.


**1.3     DEFINITION:-**
**ABBREVIATIONS AND ACRONYMS --**
Phoenix - app name.
AQI - Air Quality Index
HVAC - Heating, ventilation, and air conditioning
SRS - Software Requirement Specification


**DEFINITIONS  --**
Phoenix - An android application to maintain the HVAC for the CC3 building in IIIT Allahabad Campus.

**1.4 	REFERENCES:-**
	I.	https://www.iqair.com/us/india/uttar-pradesh/allahabad
	II.	IEEE SRS Format


**1.5	OVERVIEW OF DOCUMENT :-**
This SDS is divided into seven sections with various sub-sections. The sections of the Software Design Document are:

Introduction: describes about the document, purpose, scope of development project definitions and abbreviations used in the document.
Conceptual Architecture/Architecture Diagram: describes the overview of components, modules, structure and relationships and user interface issues.
Logical Architecture: describes Logical Architecture Description and Components.
Execution Architecture: defines the runtime environment, processes, deployment view.
Design Decisions and Trade-offs: describes the decisions taken along with the reason as to why they were chosen over other alternatives.
Pseudocode for components: describes pseudocode, as the name indicates.
Appendices: describes subsidiary matter if any.


**2. Logical Architecture --**

**2.1 CLASS DIAGRAM EXPLANATION**
All the classes in the class diagram mentioned are room , device , ac , fan , ventilator , heater .
The four classes ac, fan, heater, ventilator are the subclasses of the device class.
All these classes use the database to store their data.
The lines without arrow shows that the connection is bi-direction. It signifies
that one class just makes an instance of another class, but not dependent on each other in any way.
Like the room class and the rest of the classes is association linkage.

**2.2 STATE DIAGRAM EXPLANATION**
Initial state is being shown by starting with a black dot. Final State is being
shown by the black dot surrounded by an empty circle.

**2.2.1 Home Page --**
In the home page we will be able to go to two other pages by clicking any of the Relative Layouts, by this we will be entering the each room

**2.2.2 Class_Room --**
In the classroom we will be able to choose between two relative layouts …
That are devices and enter data
To enter the present weather conditions click enter_data relative layout
To check the devices and the states click devices relative layout

**2.2.3 Displaying the available devices  --**

In there we can find a button EDIT DEVICES with which we navigate to add or remove devices
After the  completion of adding  or removing devices, ( users choice) The user will be able to see the available devices which are connected to the application
While displaying the devices , if any of the devices are not in working condition then the user will be able to find the device with defects and can remove the device from the application.

**2.2.4 Entering present weather data--**
The precondition of entering the present data is that at least 1 device is required. ( at least one device must be added before )
The user assigns the present weather condition to the device which is taken from the sensors in real scenario.

**2.2.5 Analysing the Data --**
The application analyses the  data which was taken from  the user and changes the state of the  electronic devices which are connected to the application.

**2.2.6 Display the final state of the  devices --**
After changing the state of the devices according to the weather conditions , the application displays the present state of the working electronic devices

**2.2.7 Adding a device --**
The user can add a minimum number of  devices  which includes a fan , an Ac , a heater. After adding minimum devices the user has an option to add any number of devices according to his choice and requirement.

**2.2.8 Removing a device--**
If the user wants to remove any device in a particular class room he can do this by simply choosing to remove after clicking the edit devices button.
If the process of removing a device isn't completed successfully then the user will be prompted about this.

**2.3 SEQUENCE DIAGRAM EXPLANATION**

**2.3.1 Displaying the available devices  --**
Here we are showing the available devices and their states.
We can go to edit devices using EDIT_DEVICES button 

**2.3.2 Entering present weather data--**
We can enter present weather data as input parameters to change the state of devices

**2.3.3 Display the final state of the  devices --**
It automatically gets updated in the database
We can see that in the devices , where it shows the state of all devices

**2.3.4 Adding a device --**
We can add any device according to the option present there
We are also prompted if a device is not added

**2.3.5 Removing a device--**
We can remove any device according to our choice
We are also prompted if a device is not added


**2.4 ACTIVITY DIAGRAM EXPLANATION**

**2.4.1 Home Page --**
In the home page we will be able to go to two other pages by clicking any of the Relative Layouts, by this we will be entering the each room

**2.4.2 Class_Room --**
In the classroom we will be able to choose between two relative layouts …
That are devices and enter data
To enter the present weather conditions click enter_data relative layout
To check the devices and the states click devices relative layout

**2.4.3 Displaying the available devices  --**
In there we can find a button EDIT DEVICES with which we navigate to add or remove devices
After the  completion of adding  or removing devices, ( users choice) The user will be able to see the available devices which are connected to the application
While displaying the devices , if any of the devices are not in working condition then the user will be able to find the device with defects and can remove the device from the application.

**2.4.4 Entering present weather data--**
The precondition of entering the present data is that at least 1 device is required. ( atleast one device must be added before )
The user assigns the present weather condition to the device which is taken from the sensors in real scenario.

**2.4.5 Analysing the Data --**
The application analyses the  data which was taken from  the user and changes the state of the  electronic devices which are connected to the application.

**2.4.6 Display the final state of the  devices --**
After changing the state of the devices according to the weather conditions , the application displays the present state of the working electronic devices

**2.4.7 Adding a device --**
The user can add a minimum number of  devices  which includes a fan , an Ac , a heater. After adding minimum devices the user has an option to add any number of devices according to his choice and requirement.

**2.4.8 Removing a device--**
If the user wants to remove any device in a particular class room he can do this by simply choosing to remove after clicking the edit devices button.
If the process of removing a device isn't completed successfully then the user will be prompted about this.


**3. OTHER DESCRIPTION**

**3.1 Execution Architecture**
Runtime environment required is any device supporting Android Operating
System or the Desktop Operating System.

**3.2 Reuse and relationships to other products**
NIL

**4. DESIGN, DECISION AND TRADEOFFS**
The design decision to use two screens separately for admin and student is to provide encapsulation. 
It may have been possible to get all the information on one screen.
However, using two screens will keep the data of admin separate from the data being accessed by students.
A possible tradeoff when considering links is to use buttons instead of items in the menu. 
This design decision - to use buttons for navigating between screens - is to enhance visibility. 
Text links in the menu bar located at the bottom of the PDA’s screen can be hard to see. 
The tradeoff for buttons with descriptive labels rather than  text links in the menu bar will be that navigation from screen to screen will be easier. 
Descriptive labels will let the user know where he is navigating. Buttons are larger
