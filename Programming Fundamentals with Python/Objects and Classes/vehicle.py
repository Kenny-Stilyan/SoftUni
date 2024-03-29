
class Vehicle:
    def __init__(self, vehicle_type, model, price) -> None:
        self.vehicle_type = vehicle_type
        self.model = model
        self.price = price
        self.owner = None

    def buy(self, money:int, owner:str):
        if self.price <= money and self.owner == None:
            change = money - self.price
            self.owner = owner
            return f"Successfully bought a {vehicle_type}. Change: {change}"
        if self.price > money:
            return "Sorry, not enough money"
        if self.owner != None:
            return "Car already sold"

    def sell(self):
        if self.owner != None:
            self.owner = None
        else:
            return "Vehicle has no owner"

    def __repr__(self) -> str:
        if self.owner != None:
            return f"{self.model} {self.vehicle_type} is owned by: {self.owner}"
        else:
            return f"{self.model} {self.vehicle_type} is on sale: {self.price}"


vehicle_type = "car"
model = "BMW"
price = 30000
vehicle = Vehicle(vehicle_type, model, price)
print(vehicle.buy(15000, "Peter"))
print(vehicle.buy(35000, "George"))
print(vehicle)
vehicle.sell()
print(vehicle)
