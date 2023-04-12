<h2>Java Runtime Memory or JVM Memory Subsystem</h2>

**Objects** are allocated in **Heap Memory**
**Static members** are allocated in **Class Area or Method Area**
**Local variables** are allocated in **Stack** so for every method a stack is created and they are allocated in it

JVM Memory Subsystem:
The JVM actually uses 5 memory parts for every program execution.

1. Heap - instance members, objects (objects are runtime entities)
2. Class/Method Area - static variables, method byte codes, all class information (like class name, parent class name, interface name, etc.) its size is in KBs, very less space
3. Stack - local variables (stacks are created for every method and here local variables are stored
4. PC, SP, FP Registers
5. Native Stacks - used for native methods (non-java methods) for foreign language methods

JVM uses 3 Registers:
1. PC - (Program Counter)
2. SP - (Stack Pointer)
3. FP - (Frame Pointer)
