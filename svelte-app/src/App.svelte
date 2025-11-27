<script>
	import Hijo from "./hijo.svelte";
	export let name;
	let nombre = '';

	let contador = 0;
	function incremental(){
		contador = contador + 1;
	}

	function Saludar(){
		alert("Hola " + (nombre ? nombre : "No hay nombre"));

	}
</script>

<main>
	<h1> Contar: {contador}</h1>
	<button on:click={incremental}>Sumar ++ </button>
	<Hijo texto = "Salvar"></Hijo>
	<Hijo texto = "Borrar" color = "red"></Hijo>

	<input type="text" placeholder="Escribe tu nombre" bind:value={nombre}>
	<button on:click={Saludar}> Saludar</button>
	<!-- 
	<h1>Holaa {nombre}!</h1>
	<p>Visit the <a href="https://svelte.dev/tutorial">Svelte tutorial</a> to learn how to build Svelte apps.</p>
	-->

</main>

<style>
	main {
		text-align: center;
		padding: 1em;
		max-width: 240px;
		margin: 0 auto;
	}

	h1 {
		color: #ff3e00;
		text-transform: uppercase;
		font-size: 4em;
		font-weight: 100;
	}

	@media (min-width: 640px) {
		main {
			max-width: none;
		}
	}
</style>