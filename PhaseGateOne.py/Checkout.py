
cst_name = input("What is the customer's name?: ")


item = input("What did the user buy?: ")
quantity = int(input("How many pieces?: "))
unit_price = float(input("How much per unit?: "))


request = input("Add more items?: ")


item2 = ""
quantity2 = 0
unit_price2 = 0


if request.lower() == "yes":
    item2 = input("What did the user buy?: ")
    quantity2 = int(input("How many pieces?: "))
    unit_price2 = float(input("How much per unit?: "))


cashiers_name = input("What is your name?: ")


discount = float(input("How much discount will he get?: "))

item_total = quantity * unit_price


item_total2 = 0
if request.lower() == "yes":
    item_total2 = quantity2 * unit_price2


subtotal_before_discount = item_total + item_total2
discount_amount = subtotal_before_discount * (discount / 100)
subtotal = subtotal_before_discount - discount_amount
vat = subtotal * 0.075
bill_total = subtotal + vat

print("\nSEMICOLON STORES")
print("MAIN BRANCH")
print("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.")
print("TEL: 03293828343")
print("Date: 18-Dec-22 8:48:11 pm")
print("Cashier:", cashiers_name)
print("Customer Name:", cst_name)
print("====================================================")
print("ITEM\t\tQTY\tPRICE\t\tTOTAL(NGN)")
print("----------------------------------------------------")
print(item + "\t\t" + str(quantity) + "\t" + str(unit_price) + "\t\t" + str(item_total))


if request.lower() == "yes":
    print(item2 + "\t\t" + str(quantity2) + "\t" + str(unit_price2) + "\t\t" + str(item_total2))

print("----------------------------------------------------")
print("\t\t\tSub Total:\t", subtotal_before_discount)
print("\t\t\tDiscount:\t", discount_amount)
print("\t\t\tVAT @ 7.50%:\t", vat)
print("====================================================")
print("\t\t\tBill Total:\t", bill_total)
print("====================================================")
print("THIS IS NOT A RECEIPT KINDLY PAY", bill_total)
print("====================================================")


amount_paid = float(input("How much did the customer give to you?: "))
change = amount_paid - bill_total
print("Amount Paid:", amount_paid)
print("Balance:", change)