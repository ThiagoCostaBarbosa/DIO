import styled from 'styled-components';

export const Wrapper = styled.div`
  display: flex;
  gap: 16px;
  height: 3em;

  input {
    flex-grow: 1;
    padding: 8px 16px;
    background: #fff;
    border: 1px solid #ccc;
    border-radius: 16px;
  }

  button {
    padding: 8px 16px;
    background-color: #225ed8;
    border-radius: 16px;
    color: #ffff;
    font-weight: bold;
    font-size: 16px;

    &:hover {
      background-color: #2c5282;
      box-shadow: 0 0 0.3em #0004;
    }
  }
`;
