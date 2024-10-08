Sub GenerateDailyReport()
    Dim startDate As Date
    Dim endDate As Date
    Dim currentDate As Date
    Dim rowNum As Integer
    Dim tasks() As String
    Dim i As Integer
    
    ' Set start and end dates
    startDate = DateValue("23-Aug-2023")
    endDate = DateValue("30-Sep-2023")
    
    ' Initialize tasks array
    tasks = Split("Learn basic Python,Explore Python data types (int, float, str),Understand variables and assignments,Introduction to conditional statements (if, else, elif),Working with loops (for and while),Lists and list manipulation,Dictionaries and dictionary manipulation,Introduction to functions,String manipulation and methods,File handling (reading/writing files),Exception handling (try, except),Introduction to classes and objects,Object-oriented programming concepts,Inheritance and polymorphism,Working with modules and libraries,Basic debugging techniques,Introduction to libraries (e.g., NumPy, Pandas),Data analysis with Pandas,Data visualization using Matplotlib,Introduction to APIs and web scraping,Building a simple web scraper,Introduction to databases and SQL,Connecting Python to databases,Basic SQL queries,Version control with Git and GitHub,Collaborative coding using version control,Introduction to virtual environments,Working with Jupyter Notebooks,Introduction to testing (unit tests),Writing clean and readable code,Introduction to algorithms and complexity,Problem-solving strategies,Introduction to machine learning,Linear regression with scikit-learn,Classification algorithms (e.g., Decision Trees),Clustering algorithms (e.g., K-Means),Introduction to neural networks,Building a simple neural network with TensorFlow,Natural Language Processing (NLP) basics,Sentiment analysis using NLP,Introduction to data preprocessing,Exploratory Data Analysis (EDA),Feature engineering techniques,Model evaluation and validation,Presenting data and insights effectively", ",")
    
    ' Create header row
    rowNum = 1
    Cells(rowNum, 1).Value = "SN"
    Cells(rowNum, 2).Value = "Date"
    Cells(rowNum, 3).Value = "Project Name"
    Cells(rowNum, 4).Value = "Resource Name"
    Cells(rowNum, 5).Value = "Module"
    Cells(rowNum, 6).Value = "Tasks"
    Cells(rowNum, 7).Value = "Hours"
    
    ' Loop through dates
    currentDate = startDate
    Do While currentDate <= endDate
        ' Check if current date is a weekday and not 15th August
        If Weekday(currentDate, vbMonday) <= 5 And Not (Month(currentDate) = 8 And Day(currentDate) = 15) Then
            ' Increment row number
            rowNum = rowNum + 1
            
            ' Populate data for each column
            Cells(rowNum, 1).Value = rowNum - 1
            Cells(rowNum, 2).Value = Format(currentDate, "dd-mm-yy")
            Cells(rowNum, 3).Value = "motordna"
            Cells(rowNum, 4).Value = "Kunal"
            Cells(rowNum, 5).Value = "motordna"
            
            ' Assign tasks for the day
            For i = 0 To UBound(tasks)
                If rowNum - 1 = i + 1 Then
                    Cells(rowNum, 6).Value = tasks(i)
                    Exit For
                End If
            Next i
            
            ' Clear Hours column for manual input
            Cells(rowNum, 7).Value = ""
        End If
        
        ' Move to the next day
        currentDate = currentDate + 1
    Loop
    
    ' Autofit columns for better visibility
    Columns.AutoFit
End Sub
