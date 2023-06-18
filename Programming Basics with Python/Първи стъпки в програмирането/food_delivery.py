
chicken = int(input())
fish = int(input())
vegan = int(input())
delivary = 2.50

chicken_menu = chicken * 10.35
fish_menu = fish * 12.40
vegan_menu = vegan * 8.15

menu_price = chicken_menu + fish_menu + vegan_menu
dessert_price = menu_price * (20/100)
total = menu_price + dessert_price + delivary

print(total)