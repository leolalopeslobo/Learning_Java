Use of inheritance between Customers

This can be done in 2 ways
1. Using Setters

    Customer - Parent Class
    ClassicCustomer - Child Class
    Customer();
    ClassicCustomer(){
      super();
    }
    
    
2. Using Customers


Note: Never initialize members if they are not final or static, since this violates the principle of object model. Since objects have data and classes do not.
