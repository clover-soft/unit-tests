"""
Модуль для тестирования функций в lesson06.
"""
from lesson06 import Lesson06

def test_first_list_greater():
    """
    Проверка функции compare_lists когда среднее значение 
    первого списка больше среднего второго.   
    """
    list1 = [6, 7, 8, 9, 10]
    list2 = [1, 2, 3, 4, 5]
    expected_output = "Первый список имеет большее среднее значение"
    instance = Lesson06()
    assert instance.compare_lists(list1, list2) == expected_output


def test_second_list_greater():
    """
    Проверка функции compare_lists когда среднее значение
    второго списка больше среднего первого.
    """
    list1 = [1, 2, 3, 4, 5]
    list2 = [6, 7, 8, 9, 10]
    expected_output = "Второй список имеет большее среднее значение"
    instance = Lesson06()
    assert instance.compare_lists(list1, list2) == expected_output


def test_equal_averages():
    """
    Проверка функции compare_lists когда средние значения равны.
    """
    list1 = [1, 2, 3, 4, 5]
    list2 = [5, 4, 3, 2, 1]
    expected_output = "Средние значения равны"
    instance = Lesson06()
    assert instance.compare_lists(list1, list2) == expected_output
