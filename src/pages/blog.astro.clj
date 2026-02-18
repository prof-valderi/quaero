---
import BaseLayout from "../layouts/BaseLayout.astro";

// Depois você pode migrar isso para Content Collections (Markdown).
const posts = [
  {
    title: "Nota editorial: por que Quaero?",
    date: "2025-01-10",
    tag: "Editorial",
    excerpt: "Um projeto editorial independente, com rigor e clareza: o que buscamos publicar.",
  },
  {
    title: "Como submeter um ensaio, resenha ou tradução",
    date: "2025-01-12",
    tag: "Guia",
    excerpt: "Diretrizes simples para facilitar a vida do autor e do editor.",
  },
  {
    title: "Leitura e fichamento: um método curto",
    date: "2025-01-15",
    tag: "Método",
    excerpt: "Um roteiro prático para estudar filosofia sem perder o fio do argumento.",
  },
];
---

<BaseLayout title="Blog — Quaero" description="Textos avulsos, notas editoriais e resenhas curtas.">
  <div class="section-title">
    <h1 class="serif">Blog</h1>
    <span class="badge">Textos avulsos</span>
  </div>

  <p class="lead">
    Notas editoriais, textos curtos e bastidores do projeto. (Depois a gente transforma isso em posts reais.)
  </p>

  <div class="grid cols-2" style="margin-top:16px;">
    {posts.map((p) => (
      <article class="card" style="padding:16px;">
        <div style="display:flex; justify-content:space-between; gap:12px; flex-wrap:wrap;">
          <div class="badge">{p.tag}</div>
          <div class="small muted">{p.date}</div>
        </div>
        <div style="height:10px"></div>
        <h2 class="serif" style="font-size:1.35rem;">{p.title}</h2>
        <p class="small muted">{p.excerpt}</p>
        <div style="margin-top:12px;">
          <a class="btn secondary" href="/contato">Pedir publicação</a>
        </div>
      </article>
    ))}
  </div>

  <hr class="hr" />

  <div class="card" style="padding:16px;">
    <h2 class="serif">Quer sugerir um tema?</h2>
    <p class="small muted">
      Sugestões de dossiês e traduções são bem-vindas.
    </p>
    <a class="btn" href="/contato">Enviar sugestão</a>
  </div>
</BaseLayout>
