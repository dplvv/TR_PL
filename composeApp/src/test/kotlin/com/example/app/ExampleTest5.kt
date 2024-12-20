
        import kotlin.test.Test
        import kotlin.test.assertEquals

        class ExampleTest5 {
            @Test
            fun testListSize() {
                val list = listOf(1, 2, 3)
                assertEquals(3, list.size, "List should contain 3 elements")
            }
        }
    