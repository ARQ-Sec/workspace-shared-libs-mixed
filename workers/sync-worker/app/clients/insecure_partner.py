import requests

def fetch_payload(url: str) -> str:
    return requests.get(url, verify=False, timeout=5).text
