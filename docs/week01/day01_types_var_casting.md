# Week 01 - Day 01: Types, var, casting & numeric promotion (Java 17)

## 1) Conceptos clave
### `var`
- `var` infiere el tipo en *compile-time* a partir del valor asignado.
- No puedes usar `var` con `null` porque no hay tipo que inferir.

### División
- Si ambos operandos son `int`, el resultado es `int` (división entera).
- Si uno es `double`, el resultado es `double`.

### Promoción numérica
- En operaciones, `byte/short/char` se promueven a `int`.
- Por eso `byte b = 10; b = b + 1;` **NO compila** (porque `b+1` es `int`).

### Casting
- Un cast puede:
    - Hacer que compile
    - Cambiar el valor por overflow/underflow (ej: `130 -> byte`)

## 2) Trampas típicas OCP
- Confundir división entera (5) con división double (5.0).
- Asumir que `byte + byte` resulta en `byte` (NO, resulta en `int`).
- Creer que `var v = null;` compila (NO).

## 3) Preguntas tipo examen (sin resolver aquí)
1. ¿Qué imprime `System.out.println(5/2);`?
2. ¿Compila esto?
   ```java
   byte b = 1;
   b = b + 1;
