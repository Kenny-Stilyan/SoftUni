
cards = input().split()
num_of_shuffles = int(input())

for shuffling in range(num_of_shuffles):
    middle_of_deck = len(cards) // 2
    right_deck = cards[middle_of_deck:]
    left_deck = cards[:middle_of_deck]

    final_deck = []
    for card_index in range(len(left_deck)):
        final_deck.append(left_deck[card_index])
        final_deck.append(right_deck[card_index])
    cards = final_deck

print(cards)

