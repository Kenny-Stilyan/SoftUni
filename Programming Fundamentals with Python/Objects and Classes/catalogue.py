
class Catalogue:
    def __init__(self, name:str) -> None:
        self.name = name
        self.products = []

    def add_product(self, product_name:str):
        self.products.append(product_name)

    def get_by_letter(self, first_letter:str) -> list:
        return [product for product in self.products if product.startswith(first_letter)]

    def __repr__(self) -> str:
        part1 = f"Items in the {self.name} catalogue:\n"
        part2 = "\n".join(self.products)
        return part1 + part2


catalogue = Catalogue("Furniture") 
catalogue.add_product("Sofa") 
catalogue.add_product("Mirror") 
catalogue.add_product("Desk") 
catalogue.add_product("Chair") 
catalogue.add_product("Carpet") 
print(catalogue.get_by_letter("C")) 
print(catalogue) 
