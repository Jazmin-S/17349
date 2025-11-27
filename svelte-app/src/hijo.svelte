<script>
// CODIGO JS
export let texto = 'Boton';
export let color = 'green';
</script>

<!-- Markup html -->
<button style="--btn-color: {color}">
    {texto}
</button>

<style>
/* CODIGO CSS */
    button {color: #0d035f; 
        background-color: var(--btn-color);
        }

</style>