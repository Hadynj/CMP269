# CMP 269: Programming Methods III
# In-Class Assignment: Pandas Series and DataFrames

import pandas as pd

"""
INSTRUCTIONS:
Complete the following 4 tasks using the pandas library.
Run your script frequently to see how the DataFrames look in the console!
"""


def task_1_series_creation():
    """
    TASK 1: Create a Series

    1. Create a dictionary mapping 4 Lehman building names to their floor counts.
    2. Convert this dictionary into a Pandas Series.
    3. Print the Series.
    """

    print("\n--- Task 1: Building Series ---\n")

    # dictionary of buildings and floor counts
    buildings = {
        "Gillet": 4,
        "Carman": 3,
        "Music": 3,
        "Library": 4
    }

    # convert dictionary to series
    building_series = pd.Series(buildings)

    # display series
    print(building_series)



def task_2_dataframe_creation():
    """
    TASK 2: Create a DataFrame
        1. Create a dictionary of lists containing data for at least 3 courses:
            -'CourseCode': ['CMP168''CMP269','CMP338']
            -'Credits': [4, 4, 4]
            - 'Enrolled': [25, 30, 20]
        2. Convert this into a Pandas DataFrame.
        3. Print the DataFrame.
    """

    print("\n--- Task 2: Course DataFrame ---\n")

    # Dictionary of course data
    course_data = {
        'CourseCode': ['CMP168', 'CMP269', 'CMP338'],
        'Credits': [4, 4, 4],
        'Enrolled': [25, 30, 20]
    }

    # Convert dictionary to DataFrame
    df = pd.DataFrame(course_data)

    # Print the DataFrame
    print(df)



def task_3_data_manipulation():
    """
    TASK 3: Filtering and Math

    1. Using the same data from Task 2, create the DataFrame here again.
    2. Filter the DataFrame to only show courses with more than 20 students enrolled.
    3. Calculate and print the total number of students across ALL courses.
    """

    print("\n--- Task 3: Filtering and Math ---\n")

    # Recreate DataFrame
    course_data = {
        'CourseCode': ['CMP168', 'CMP269', 'CMP338'],
        'Credits': [4, 4, 4],
        'Enrolled': [25, 30, 20]
    }

    df = pd.DataFrame(course_data)

    # Filter courses with more than 20 students
    filtered_df = df[df['Enrolled'] > 20]

    print("Courses with more than 20 students enrolled:")
    print(filtered_df)

    # Calculate total enrolled students
    total_students = df['Enrolled'].sum()

    print("\nTotal students across all courses:", total_students)


