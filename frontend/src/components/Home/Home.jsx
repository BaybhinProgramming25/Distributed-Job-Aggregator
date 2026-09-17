import { Link } from 'react-router-dom';
import './Home.css';

const Home = () => {
  return (
    <div className="home-page">
      <section className="home-hero">
        <h1 className="home-hero-title">Distributed Job Aggregator</h1>
        <p className="home-hero-sub">
          A distributed job-posting watcher. Subscribe to the companies you care about
          and see new openings land on your dashboard the moment our workers find them.
        </p>
        <div className="home-hero-ctas">
          <Link to="/signup" className="home-cta home-cta--primary">Get Started</Link>
          <Link to="/login" className="home-cta home-cta--secondary">Log in</Link>
        </div>
      </section>

      <section className="home-features">
        <div className="home-feature-card">
          <h2>Distributed Scraping</h2>
          <p>The poller looks for jobs every 30 minutes and pushes them to a queue for worker nodes to process.</p>
        </div>
        <div className="home-feature-card">
          <h2>Live Dashboard</h2>
          <p>Any new jobs processed and stored by the workers are pushed onto your dashboard through WebSockets.</p>
        </div>
        <div className="home-feature-card">
          <h2>Click and Apply</h2>
          <p>New postings are laid out as cards — click one and it takes you straight to the application.</p>
        </div>
      </section>
    </div>
  );
};

export default Home;
