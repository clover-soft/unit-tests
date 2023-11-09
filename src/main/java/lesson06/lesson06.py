
"""
Класс Lesson06
"""


class Lesson06:
    """
    Класс Lesson06
    """

    def __init__(self):
        pass

    def calculate_average(self, numbers):
        """
        Вычисляет среднее значение списка.
        """
        return sum(numbers) / len(numbers)

    def compare_lists(self, list1, list2):
        """
        Сравнивает средние значения двух списков.
        """
        avg1 = self.calculate_average(list1)
        avg2 = self.calculate_average(list2)
        if avg1 > avg2:
            return "Первый список имеет большее среднее значение"
        if avg2 > avg1:
            return "Второй список имеет большее среднее значение"
        return "Средние значения равны"
