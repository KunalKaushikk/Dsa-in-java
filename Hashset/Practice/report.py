import pandas as pd
import random

# Load the existing Excel file
excel_filename = "project_tasks.xlsx"
df = pd.read_excel(excel_filename)

# Define the start and end dates
start_date = pd.to_datetime("2023-08-14")
end_date = pd.to_datetime("2023-09-30")

# Define the modules and tasks
modules = [
    "Learn basic Python",
    "Explore Python data types (int, float, str)",
    "Understand variables and assignments",
    "Introduction to conditional statements (if, else, elif)",
    "Working with loops (for and while)",
    "Lists and list manipulation",
    "Dictionaries and dictionary manipulation",
    "Introduction to functions",
    "String manipulation and methods",
    "File handling (reading/writing files)",
    "Exception handling (try, except)",
    "Introduction to classes and objects",
    "Object-oriented programming concepts",
    "Inheritance and polymorphism",
    "Working with modules and libraries",
    "Basic debugging techniques",
    "Introduction to libraries (e.g., NumPy, Pandas)",
    "Data analysis with Pandas",
    "Data visualization using Matplotlib",
    "Introduction to APIs and web scraping",
    "Building a simple web scraper",
    "Introduction to databases and SQL",
    "Connecting Python to databases",
    "Basic SQL queries",
    "Version control with Git and GitHub",
    "Collaborative coding using version control",
    "Introduction to virtual environments",
    "Working with Jupyter Notebooks",
    "Introduction to testing (unit tests)",
    "Writing clean and readable code",
    "Introduction to algorithms and complexity",
    "Problem-solving strategies",
    "Introduction to machine learning",
    "Linear regression with scikit-learn",
    "Classification algorithms (e.g., Decision Trees)",
    "Clustering algorithms (e.g., K-Means)",
    "Introduction to neural networks",
    "Building a simple neural network with TensorFlow",
    "Natural Language Processing (NLP) basics",
    "Sentiment analysis using NLP",
    "Introduction to data preprocessing",
    "Exploratory Data Analysis (EDA)",
    "Feature engineering techniques",
    "Model evaluation and validation",
    "Presenting data and insights effectively",
]

# Update the specified rows and columns
for i, row in df.iterrows():
    current_date = start_date + pd.DateOffset(days=i)
    if current_date <= end_date:
        df.at[i, "Date"] = current_date.strftime("%d-%m-%Y")
        df.at[i, "Project Name"] = "motordna"
        df.at[i, "Resource Name"] = "Kunal"
        df.at[i, "Module"] = random.choice(modules)
        df.at[i, "Tasks"] = "Work tasks"  # You can customize this as needed
        # Randomly choose hours between 5:30 to 7:30
        hours = f"{random.randint(5, 7)}:{random.choice(['00', '15', '30', '45'])}"
        df.at[i, "Hours"] = hours

# Save updated DataFrame to Excel
updated_excel_filename = "updated_project_tasks.xlsx"
df.to_excel(updated_excel_filename, index=False)

print(f"Updated Excel file '{updated_excel_filename}' created successfully.")
