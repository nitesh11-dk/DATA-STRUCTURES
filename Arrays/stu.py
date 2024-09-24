import inddex
# from inddex import add
import add from inddex

students = [
    {
        "nam":"Tarika",
        "age": 23,
        "marks":[23,45,67]
    },
    {
        "nam":"Mike",
        "age": 29,
        "marks":[45,67,89]
    },
    {
        "nam":"Ryan",
        "age": 26,
        "marks":[345,56,7,4]
    }
]


for stu in students:
    print(f"{stu["nam"]} total marks is {inddex.add(stu["marks"])}")

