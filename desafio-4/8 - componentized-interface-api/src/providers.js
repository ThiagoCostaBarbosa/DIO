import React from 'react'
import { ResetCSS } from "./services/global/resetCSS";
import GithubProvider from './providers/githubprovider'
import App from './App';

const Providers = () => {
  return (
    <main>
      <GithubProvider>
        <ResetCSS />
        <App />
      </GithubProvider>
    </main>
  )
}

export default Providers