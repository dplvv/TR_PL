
        import kotlin.test.Test
        import kotlin.test.assertNotNull

        class ExampleTest3 {
            @Test
            fun testObjectIsNotNull() {
                val obj = Any()
                assertNotNull(obj, "Object should not be null")
            }
        }
    