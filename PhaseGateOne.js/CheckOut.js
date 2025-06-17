let cstName, item, quantity, unitPrice, request;
let item2 = "", quantity2 = 0, unitPrice2 = 0;
let cashiersName, discount, amountPaid;

try {
    cstName = prompt("What is the customer's name?: ");
    if (!cstName) throw new Error("Customer name is required.");

    item = prompt("What did the user buy?: ");
    if (!item) throw new Error("Item name is required.");

    quantity = parseInt(prompt("How many pieces?: "));
    if (isNaN(quantity) || quantity < 1) throw new Error("Quantity must be a valid number.");

    unitPrice = parseFloat(prompt("How much per unit?: "));
    if (isNaN(unitPrice) || unitPrice <= 0) throw new Error("Unit price must be a valid number.");

    request = prompt("Add more items?: ");
    if (!request) throw new Error("Please enter 'yes' or 'no'.");

} catch (e) {
    alert("Error: " + e.message);
    throw e;
}

if (request.toLowerCase() === "yes") {
    try {
        item2 = prompt("What did the user buy?: ");
        if (!item2) throw new Error("Second item name is required.");

        quantity2 = parseInt(prompt("How many pieces?: "));
        if (isNaN(quantity2) || quantity2 < 1) throw new Error("Second quantity must be valid.");

        unitPrice2 = parseFloat(prompt("How much per unit?: "));
        if (isNaN(unitPrice2) || unitPrice2 <= 0) throw new Error("Second unit price must be valid.");
    } catch (e) {
        alert("Error in second item: " + e.message);
        throw e;
    }
}

try {
    cashiersName = prompt("What is your name?: ");
    if (!cashiersName) throw new Error("Cashier name is required.");

    discount = parseFloat(prompt("How much discount will he get?: "));
    if (isNaN(discount) || discount < 0) throw new Error("Discount must be a valid number.");

    amountPaid = parseFloat(prompt("How much did the customer give to you?: "));
    if (isNaN(amountPaid) || amountPaid < 0) throw new Error("Amount paid must be valid.");
} catch (e) {
    alert("Error: " + e.message);
    throw e;
}

let itemTotal = quantity * unitPrice;
let itemTotal2 = 0;

if (request.toLowerCase() === "yes") {
    itemTotal2 = quantity2 * unitPrice2;
}

let subtotalBeforeDiscount = itemTotal + itemTotal2;
let discountAmount = subtotalBeforeDiscount * (discount / 100);
let subtotal = subtotalBeforeDiscount - discountAmount;
let vat = subtotal * 0.075;
let billTotal = subtotal + vat;
let change = amountPaid - billTotal;

// Console Output
console.log("\nSEMICOLON STORES");
console.log("MAIN BRANCH");
console.log("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.");
console.log("TEL: 03293828343");
console.log("Date: 18-Dec-22 8:48:11 pm");
console.log("Cashier: " + cashiersName);
console.log("Customer Name: " + cstName);
console.log("====================================================");
console.log("ITEM\t\tQTY\tPRICE\t\tTOTAL(NGN)");
console.log("----------------------------------------------------");
console.log(item + "\t\t" + quantity + "\t" + unitPrice + "\t\t" + itemTotal);
if (request.toLowerCase() === "yes") {
    console.log(item2 + "\t\t" + quantity2 + "\t" + unitPrice2 + "\t\t" + itemTotal2);
}
console.log("----------------------------------------------------");
console.log("\t\t\tSub Total:\t" + subtotalBeforeDiscount);
console.log("\t\t\tDiscount:\t" + discountAmount);
console.log("\t\t\tVAT @ 7.50%:\t" + vat);
console.log("====================================================");
console.log("\t\t\tBill Total:\t" + billTotal);
console.log("====================================================");
console.log("THIS IS NOT A RECEIPT KINDLY PAY " + billTotal);
console.log("====================================================");
console.log("Amount Paid: " + amountPaid);
console.log("Balance: " + change);

// Alert Output
function displayWithAlert() {
    let invoiceText = "\nSEMICOLON STORES\n";
    invoiceText += "MAIN BRANCH\n";
    invoiceText += "LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.\n";
    invoiceText += "TEL: 03293828343\n";
    invoiceText += "Date: 18-Dec-22 8:48:11 pm\n";
    invoiceText += "Cashier: " + cashiersName + "\n";
    invoiceText += "Customer Name: " + cstName + "\n";
    invoiceText += "====================================================\n";
    invoiceText += "ITEM\t\tQTY\tPRICE\t\tTOTAL(NGN)\n";
    invoiceText += "----------------------------------------------------\n";
    invoiceText += item + "\t\t" + quantity + "\t" + unitPrice + "\t\t" + itemTotal + "\n";
    if (request.toLowerCase() === "yes") {
        invoiceText += item2 + "\t\t" + quantity2 + "\t" + unitPrice2 + "\t\t" + itemTotal2 + "\n";
    }
    invoiceText += "----------------------------------------------------\n";
    invoiceText += "\t\t\tSub Total:\t" + subtotalBeforeDiscount + "\n";
    invoiceText += "\t\t\tDiscount:\t" + discountAmount + "\n";
    invoiceText += "\t\t\tVAT @ 7.50%:\t" + vat + "\n";
    invoiceText += "====================================================\n";
    invoiceText += "\t\t\tBill Total:\t" + billTotal + "\n";
    invoiceText += "====================================================\n";
    invoiceText += "THIS IS NOT A RECEIPT KINDLY PAY " + billTotal + "\n";
    invoiceText += "====================================================\n";
    invoiceText += "Amount Paid: " + amountPaid + "\n";
    invoiceText += "Balance: " + change;

    alert(invoiceText);
}

displayWithAlert();
