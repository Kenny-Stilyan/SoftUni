
class Zoo:
    __animals = 0

    def __init__(self, name):
        self.name = name
        self.mammals = []
        self.fishes = []
        self.birds = []

    def add_animal(self, species, name):
        if species == "mammal":
            self.mammals.append(name)
        elif species == "fish":
            self.fishes.append(name)
        elif species == "bird":
            self.birds.append(name)
        Zoo.__animals += 1

    def get_info(self, species):
        if species == "mammal":
            names = ", ".join(self.mammals)
        elif species == "fish":
            names = ", ".join(self.fishes)
        elif species == "bird":
            names = ", ".join(self.birds)
        else:
            return f"No animals of species {species} in {self.name}."

        total_animals = Zoo.__animals
        return f"{species.capitalize()}s in {self.name}: {names}\nTotal animals: {total_animals}"


zoo_name = input()
n = int(input())

zoo = Zoo(zoo_name)

for _ in range(n):
    animal_species, animal_name = input().split()
    zoo.add_animal(animal_species, animal_name)

species_to_print = input()
print(zoo.get_info(species_to_print))
