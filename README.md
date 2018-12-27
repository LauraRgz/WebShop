# WebShop

I created an application that manages the products of an e-commerce. You can search a product by name, see all the products of a category, see all available products, create an account, and buy a product.
I have created two files: one to write all the products that are added to a list. The other one to read "About us".

The project has five classes: 

## Product 
This class has the following attributes:
* *id*: This is the product identificatory number.
* *name*: The product name.
* *stock*: Number of available products.
* *prize*: The prize of each product (in £).
* *categoryProduct*: The category this product belongs to.

It also has a method named *showProduct*. It prints the value of a product’s attributes.

## User
This class has four attributes:
*	*Email*: The person’s email.
*	*Password*: The password to sign in.
*	*Login*: The person’s username.
*	*Id*: Person’s identification number for this application. It is randomly generated.
User has two methods:
*	*newUser*: It creates a new username with an email, password and login.
*	*showUser*: It prints a user’s email, username, and id.

## ProductList
This class generates a list of all the products. It has one attribute: *lista*. It is declared as an ArrayList that contains objects from the Product class.

The methods are:
* *deleteProduct*: We can delete products from the list.
* *Get*: This method returns the object that is in the “i” position.
* *Size*: It returns the size of the list.
* *addProduct*: This allows us to add a new product to the list. When a product is added to the list, it is also added to a file
```java
lista.add(productToList);
	File file = new File("./ProductList.txt");
	FileOutputStream fos = null;
		
 	try {
		fos = new FileOutputStream("./ProductList.txt", true);	
		fos.write(productToList.getName().getBytes());
		fos.write(String.valueOf(productToList.getId()).getBytes());
		fos.write(String.valueOf(productToList.getPrize()).getBytes());
		fos.write(String.valueOf(productToList.getStock()).getBytes());
		fos.write(productToList.getCategoryProduct().getBytes());
	}
  
	catch (Exception e){
		e.printStackTrace();
	}
  
	finally {
		try {
			fos.close();
			file.deleteOnExit();
		}
   
		catch (Exception e) {
				
		}
	}
		
}
```

## UserList
This class generates a user list. Like ProductList, it has one attribute: *lista*. It is also declared as an ArrayList that contains objects from the class User.

The UserList methods are similar to the ProductList ones:
*	*addUser*: It adds users to the list.
*	*Get*: It returns the object in the “i” position.
*	*Size*: This method returns the size of the UserList.

## Menu
This class has one method that prints the menu and it also has the main method.
*	*Main*: I have created three objects in three different categories:
  * Category Books:
      * libro1
      * libro2
      * libro3
  * Category Films:
      * film1
      *	film2
      *	film3
 * Category Music:
      *	cd1
      *	cd2
      *	cd3

Then I created a *do-while* loop to do implement the menu. 
I declared *selector* which is the option that the user has chosen.
Once we choose an option, we enter in the *if-else* that leads us to the option that we have chosen.

### Option 1: Search products
This option looks for a product on the ProductList and prints it.
We are asked for a name and, if the name of the product exists, the attributes    will be shown.

### Option 2: See by category
This option prints all the products from a category.
We are asked for a category name, the category exists, the attributes of every product will be printed.

### Option 3: See all products
This option prints all the products in the list of products.

### Option 4: Create an account
This option allows people to create an account entering the email, password and username.

### Option 5: Buy product
This option allows people to purchase products from the list.
We are asked for the product name.

### Option 6: About us
This option shows the txt written on the AboutUs file.
```java
else if (selector == 6) {
	FileInputStream fis = null;
		try {
			fis = new FileInputStream("./AboutUs.txt");
			byte[] aboutUs = new byte[100];
			fis.read(aboutUs);		
			System.out.println(new String(aboutUs));
		}
		catch (Exception e){
			e.printStackTrace();
		}
		finally {}
}

```

### Option 0: Exit
This option stops the application

## Threads
Threads were implemented in order not to allow two user to register at the same time. When a user enters an username, an email and a password and presses the "Sign up" button, a message is sent to notify that an user is being registered and wether he user has been correctly registered or not. 

I created three new classes:
* [HiloEscrituraCola](https://github.com/LauraRgz/WebShop/blob/master/src/com/nebrija/tpra/HiloEscrituraCola.java)
* [HiloLecturaCola](https://github.com/LauraRgz/WebShop/blob/master/src/com/nebrija/tpra/HiloLecturaCola.java)
* [LectoraLineaComandos](https://github.com/LauraRgz/WebShop/blob/master/src/com/nebrija/tpra/LectoraLineaComandos.java)



## EclEmma
As it can be seen in the [Initial](https://github.com/LauraRgz/WebShop/blob/master/Final.jpg) image, I had 24.3%, after doing tests, i had 37.1% as it canbe seen in the [Final](https://github.com/LauraRgz/WebShop/blob/master/Final.jpg) image.

* Initial image
	* ![Initial](https://github.com/LauraRgz/WebShop/blob/master/Initial%202.jpg)
* Final image
	* ![Final](https://github.com/LauraRgz/WebShop/blob/master/Final%202.jpg)





