import asyncio

# Number
f1 = 1.0
f2 = 2.000001e-12
f3 = .000002e-12
f4 = .4
i = 1

# String
username = "PES"
s1 = b"byte string"
s2 = f"hello, {username}"
s3 = r"raw string"

# Boolean
b1 = (False)
b2 = True


async def bar():
    global f1

    print(f"Я засинаю, {username}")
    await asyncio.sleep(1)

    f1 += 1

def foo():
    loop = asyncio.get_event_loop()
    loop.run_until_complete(bar())


if __name__ == "__main__":
    foo()