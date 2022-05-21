import styled from "styled-components";

export const Wrapper = styled.div`
  display: flex;
  gap: 16px;
`;

export const WrapperInfoUser = styled.div`
  display: flex;
  flex-direction: column;
  flex-grow: 1;
  gap: 8px;
  font-weight: bold;

  h1 {
    font-size: 32px;
    line-height: 1;
  }

  h3 {
    font-size: 18px;
  }

  h4 {
    font-size: 16px;
  }
`;

export const WrapperStatusCount = styled.div`
  display: flex;
  flex-wrap: wrap;
  gap: 8px;
  text-align: center;

  & > * {
    background: white;
    padding: 4px 16px;
    border-radius: 16px;

    & > :last-child {
    font-weight: normal;
    }
  }
`;

export const WrapperUsername = styled.div`
  display: flex;
  flex-wrap: wrap;
  gap: 8px;
  
  a {
    font-size: 18px;
    color: #2d3748;
    font-weight: bold;
  }
`;

export const WrapperUserGeneric = styled.div`
  display: flex;
  flex-wrap: wrap;
  gap: 8px;
  
  a {
    font-size: 18px;
    color: #2d3748;
    font-weight: bold;
  }
`;

export const WrapperImage = styled.img`
  border-radius: 32px;
  box-shadow: 0 0 0.3em #0004;
  width: 200px;
  height: 200px;
`;
