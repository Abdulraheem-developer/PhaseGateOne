import datetime

try:
    last_period_input = input("Enter the first day of your last period (yyyy-mm-dd): ")
    last_period = datetime.datetime.strptime(last_period_input, "%Y-%m-%d").date()

    if last_period > datetime.date.today():
        print("Date cannot be in the future.")
        

except ValueError:
    print("Invalid date format. Please use yyyy-mm-dd.")
    

try:
    cycle_length = int(input("Enter your average cycle length (in days): "))
    if cycle_length < 15 or cycle_length > 60:
        print("Cycle length should be between 15 and 60 days.")
        

except ValueError:
    print("Please enter a valid number for cycle length.")
    

try:
    period_length = int(input("Enter your period duration (in days): "))
    if period_length < 1 or period_length > 15:
        print("Period duration should be between 1 and 15 days.")
        exit()

except ValueError:
    print("Please enter a valid number for period duration.")
    


next_period = last_period + datetime.timedelta(days=cycle_length)
ovulation_day = next_period - datetime.timedelta(days=14)

fertile_start = ovulation_day - datetime.timedelta(days=5)
fertile_end = ovulation_day + datetime.timedelta(days=1)

safe_start1 = last_period + datetime.timedelta(days=period_length)
safe_end1 = fertile_start - datetime.timedelta(days=1)

safe_start2 = fertile_end + datetime.timedelta(days=1)
safe_end2 = next_period - datetime.timedelta(days=1)


print("\n---- Menstrual Cycle Details ----")
print("Next period starts:", next_period)
print("Ovulation Day:", ovulation_day)
print("Fertile Window:", fertile_start, "to", fertile_end)
print("Safe Periods:")
print("- Before Ovulation:", safe_start1, "to", safe_end1)
print("- After Ovulation:", safe_start2, "to", safe_end2)
