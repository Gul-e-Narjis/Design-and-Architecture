Grasp principle Applying "Creator" Principle 

EXAMPLE:
 This represents a restaurant’s digital ordering system, where customers place food orders.
Without Principle (Unstructured Approach)
In this version, the Order class directly stores food details (name & price) as simple strings instead of using a 
separate Food class. While this approach works, it has several problems:

Tightly Coupled Code – The Order class is responsible for handling food details and order details together, making 
it difficult to update or scale.
Difficult to Modify – If we want to change food details (like price updates), we must manually modify every order.
No Code Reusability – The Food and Customer details cannot be reused separately across multiple orders.
🔴 Example Problem:

Imagine a local food stall where the cashier writes down orders manually without a structured system.
If a customer wants to change their food order, the cashier must rewrite the entire order manually.
With Principle (Well-Structured Approach using OOP & Creator Principle)
In this improved version, the code is structured properly using independent classes:

✔ Food Class – Stores food details (name & price) separately.
✔ Customer Class – Manages customer details independently.
✔ Order Class – Links food and customer objects instead of handling raw data.
✔ OrderFactory (Creator Principle) – Helps create Order objects efficiently.

🟢 Why This is Better?

More Organized – The order system is structured like real-world food ordering apps (McDonald’s, Foodpanda, KFC, etc.).
Scalable – Easy to add new features like discounts, multiple items per order, or delivery tracking.
Reusable Classes – Food and Customer classes can be used across multiple orders without modifying existing code.
🔵 Example Improvement:

Imagine a fast-food restaurant like McDonald's, where all orders are automatically processed in a system.
Customers can add/remove items, apply discounts, and track orders without rewriting the entire order manually.
Conclusion
The WithoutPrinciple version is basic and hard to maintain, while the WithPrinciple version follows Object-Oriented Programming (OOP)
best practices, making it scalable, flexible, and efficient for real-world applications. 🚀


